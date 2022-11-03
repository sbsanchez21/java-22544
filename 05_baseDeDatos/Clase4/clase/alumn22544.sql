-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 03-11-2022 a las 19:40:31
-- Versión del servidor: 10.4.14-MariaDB
-- Versión de PHP: 7.4.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `alumn22544`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `alumnos`
--

CREATE TABLE `alumnos` (
  `id` int(11) NOT NULL,
  `nombre` varchar(50) DEFAULT NULL,
  `apellido` varchar(50) DEFAULT NULL,
  `dni` int(11) DEFAULT NULL,
  `fechaNac` date DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `alumnos`
--

INSERT INTO `alumnos` (`id`, `nombre`, `apellido`, `dni`, `fechaNac`) VALUES
(1, 'Romina', 'Pedraza', 223332111, '2022-11-17'),
(2, 'Romina', 'Sanchez', 22333111, '2022-11-17'),
(3, 'Juan', 'Pedraza', 22333144, NULL),
(4, 'Laura', 'Tomson', 22322666, '2022-11-11'),
(5, 'kevin', 'Rodriguez', 22333666, NULL),
(7, 'Laura', 'Tomson', 24555666, NULL),
(8, 'Kevin', 'Silenti', 23555666, '2022-11-01');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `alumnosmaterias`
--

CREATE TABLE `alumnosmaterias` (
  `idAlumno` int(11) NOT NULL,
  `idMateria` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `alumnosmaterias`
--

INSERT INTO `alumnosmaterias` (`idAlumno`, `idMateria`) VALUES
(1, 1),
(1, 2),
(1, 3),
(2, 2),
(2, 4),
(3, 4);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `materias`
--

CREATE TABLE `materias` (
  `id` int(11) NOT NULL,
  `nombre` varchar(50) DEFAULT NULL,
  `descripcion` varchar(80) DEFAULT NULL,
  `idProfesor` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `materias`
--

INSERT INTO `materias` (`id`, `nombre`, `descripcion`, `idProfesor`) VALUES
(1, 'Matemática', 'Matemática inicial', 3),
(2, 'Química', 'Química General', 2),
(3, 'Física', 'Matemática inicial', 2),
(4, 'Literatura', 'Matemática inicial', 2),
(5, 'Artes plásticas', 'Matemática inicial', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `profesores`
--

CREATE TABLE `profesores` (
  `id` int(11) NOT NULL,
  `nombre` varchar(50) DEFAULT NULL,
  `apellido` varchar(50) DEFAULT NULL,
  `dni` int(11) NOT NULL,
  `telefono` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `profesores`
--

INSERT INTO `profesores` (`id`, `nombre`, `apellido`, `dni`, `telefono`) VALUES
(1, 'Roberta', 'Suarez', 23333222, 1123456433),
(2, 'Ximena', 'Suarez', 23333222, 1155546665),
(3, 'Pedro', 'Paez', 23333222, 1154634566),
(4, 'Roberta', 'Sanchez', 22222223, NULL),
(5, 'Roberta', 'Suarez', 23333222, NULL),
(6, 'Luis', 'Suarez', 22333111, NULL);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `alumnos`
--
ALTER TABLE `alumnos`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `dni_2` (`dni`),
  ADD KEY `apellido` (`apellido`),
  ADD KEY `dni` (`dni`);

--
-- Indices de la tabla `alumnosmaterias`
--
ALTER TABLE `alumnosmaterias`
  ADD PRIMARY KEY (`idAlumno`,`idMateria`),
  ADD KEY `idMateria` (`idMateria`);

--
-- Indices de la tabla `materias`
--
ALTER TABLE `materias`
  ADD PRIMARY KEY (`id`),
  ADD KEY `idxMatNombre` (`nombre`),
  ADD KEY `idProfesor` (`idProfesor`);

--
-- Indices de la tabla `profesores`
--
ALTER TABLE `profesores`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `alumnos`
--
ALTER TABLE `alumnos`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT de la tabla `materias`
--
ALTER TABLE `materias`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de la tabla `profesores`
--
ALTER TABLE `profesores`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `alumnosmaterias`
--
ALTER TABLE `alumnosmaterias`
  ADD CONSTRAINT `alumnosmaterias_ibfk_1` FOREIGN KEY (`idAlumno`) REFERENCES `alumnos` (`id`),
  ADD CONSTRAINT `alumnosmaterias_ibfk_2` FOREIGN KEY (`idMateria`) REFERENCES `materias` (`id`);

--
-- Filtros para la tabla `materias`
--
ALTER TABLE `materias`
  ADD CONSTRAINT `materias_ibfk_1` FOREIGN KEY (`idProfesor`) REFERENCES `profesores` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
